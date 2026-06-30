
console.log("Welcome to the Community Portal");
window.addEventListener('load', () => {
    alert("The Community Portal has fully loaded!"); 
});

class Event {
    constructor(id, name, date, category, seats) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.category = category;
        this.seats = seats;
    }
    
    // Adds to prototype automatically via class syntax
    checkAvailability() {
        return this.seats > 0;
    }
}


const registrationTracker = (() => {
    let totalRegistrations = 0;
    return () => {
        totalRegistrations++;
        console.log(`Total platform registrations: ${totalRegistrations}`);
        return totalRegistrations;
    };
})();

// State management (6. Arrays and Methods)
let communityEvents = [];

// 9. Async JS, Promises, Async/Await
async function fetchEvents() {
    const spinner = document.getElementById('loading-spinner');
    spinner.style.display = 'block';

    try {
        // Mocking an API call with a Promise and setTimeout
        const data = await new Promise((resolve) => {
            setTimeout(() => {
                resolve([
                    { id: 1, name: "Summer Concert", date: "2026-07-15", category: "Music", seats: 50 },
                    { id: 2, name: "Baking Basics", date: "2026-07-20", category: "Workshop", seats: 0 }, // Full
                    { id: 3, name: "Jazz Night", date: "2026-08-01", category: "Music", seats: 20 }
                ]);
            }, 1000);
        });

        // 6. Arrays and Methods: Use .map() to format and instantiate objects
        communityEvents = data.map(evt => new Event(evt.id, evt.name, evt.date, evt.category, evt.seats));
        
        // 5. Objects and Prototypes: List keys/values of the first event for demonstration
        if(communityEvents.length > 0) {
             console.log("Event Details Dump:", Object.entries(communityEvents[0]));
        }

        renderEvents(communityEvents);
    } catch (error) {
        console.error("Failed to fetch events:", error);
    } finally {
        spinner.style.display = 'none';
    }
}

// 7. DOM Manipulation & 3. Conditionals, Loops
// 10. Modern JavaScript Features: Default parameters
function renderEvents(eventsToRender = communityEvents) {
    const container = document.querySelector('#event-container');
    container.innerHTML = ''; // Clear current

    // 3. Conditionals, Loops: forEach
    eventsToRender.forEach(evt => {
        // 3. Conditionals: Only show valid (upcoming/available) events based on seats
        if (evt.checkAvailability()) {
            // 7. DOM Manipulation: createElement
            const card = document.createElement('div');
            card.className = 'event-card';
            
            // 2. Syntax, Data Types: Template literals
            card.innerHTML = `
                <h3>${evt.name} (ID: ${evt.id})</h3>
                <p>Date: ${evt.date}</p>
                <p>Category: ${evt.category}</p>
                <p>Available Seats: <span id="seats-${evt.id}">${evt.seats}</span></p>
            `;
            container.appendChild(card);
        }
    });

    // 14. jQuery and JS Frameworks: .fadeIn() for event cards
    $('.event-card').fadeIn(500);
}

// 4. Higher-Order Functions: Pass callbacks to filter functions
function filterEvents(callback) {
    // 10. Modern JavaScript: Spread operator to clone before filtering
    const clonedEvents = [...communityEvents];
    const filtered = clonedEvents.filter(callback);
    renderEvents(filtered);
}

// 8. Event Handling
document.getElementById('categoryFilter').addEventListener('change', (e) => {
    const selected = e.target.value;
    if (selected === "All") {
        renderEvents();
    } else {
        // 6. Arrays and Methods: .filter()
        filterEvents(evt => evt.category === selected);
    }
});

document.getElementById('searchInput').addEventListener('keydown', (e) => {
    if (e.key === 'Enter') {
        const query = e.target.value.toLowerCase();
        filterEvents(evt => evt.name.toLowerCase().includes(query));
    }
});

// 11. Working with Forms & 12. AJAX & Fetch API & 14. jQuery
$('#registerBtn').click(async function(e) {
    // 11. Working with forms: Prevent default (though it's a button type='button', good practice for submit)
    e.preventDefault(); 
    
    const form = document.getElementById('registrationForm');
    // 11. Working with Forms: form.elements
    const { userName, userEmail, eventId } = form.elements; 
    
    // Basic inline validation
    if (!userName.value) { $('#nameError').show(); return; } else { $('#nameError').hide(); }
    if (!userEmail.value) { $('#emailError').show(); return; } else { $('#emailError').hide(); }

    const id = parseInt(eventId.value);
    const targetEvent = communityEvents.find(evt => evt.id === id);

    // 3. Conditionals, Loops, Error Handling: try-catch
    try {
        if (!targetEvent) throw new Error("Event not found.");
        if (!targetEvent.checkAvailability()) throw new Error("Event is fully booked.");

        // 12. AJAX & Fetch API: Simulate POST backend communication
        const response = await fetch('https://jsonplaceholder.typicode.com/posts', {
            method: 'POST',
            body: JSON.stringify({ name: userName.value, email: userEmail.value, eventId: id }),
            headers: { 'Content-type': 'application/json; charset=UTF-8' },
        });

        if (!response.ok) throw new Error("Network response was not ok");

        // 2. Syntax, Data Types, Operators: Use -- to manage seat count
        targetEvent.seats--;
        
        // 7. DOM Manipulation: Update UI dynamically
        document.getElementById(`seats-${id}`).innerText = targetEvent.seats;
        
        // Use closure tracker
        registrationTracker();

        // 12. AJAX & Fetch API: Show success message
        $('#formMessage').html('<span style="color:green;">Registration Successful!</span>');
        
        // 13. Debugging and Testing: Log payload and step
        console.log("Form submission step complete. Payload sent:", { name: userName.value, eventId: id });
        // debugger; // Uncomment to inspect variables in Chrome Dev Tools

        // 14. jQuery: fadeOut effect on message after delay
        setTimeout(() => $('#formMessage').fadeOut(), 3000);

    } catch (error) {
        // Handle custom and fetch errors
        $('#formMessage').html(`<span style="color:red;">Error: ${error.message}</span>`).show();
        console.error("Registration failed silently in background, caught by try-catch:", error);
    }
});

// Initialize App
fetchEvents();

