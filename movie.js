function bookTicket(name, email, seats) {
  if(!/^[A-Za-z ]+$/.test(name)) return "Invalid Name";
  if(!/^\S+@\S+\.\S+$/.test(email)) return "Invalid Email";
  if(!(seats >= 1 && seats <= 10)) return "Seats must be 1–10";

  const booking = { name, email, seats };
  console.log("Ticket Confirmed:", booking);
}

bookTicket("Rahul", "rahul@mail.com", 4);
