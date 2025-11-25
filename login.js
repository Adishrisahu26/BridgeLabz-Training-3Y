function login(username, password) {
  if(!/^[A-Za-z0-9]{5,}$/.test(username)) return "Username must be ≥ 5 chars";
  if(!/(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[\W_]).{8,}$/.test(password))
    return "Weak password";

  return "Login Successful";
}

console.log(login("admin123", "Abc@1234"));
