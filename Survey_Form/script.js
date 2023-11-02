function submitForm() {
    const formData = {
      "First Name": document.getElementById("first-name").value,
      "Last Name": document.getElementById("last-name").value,
      "Date of Birth": document.getElementById("dob").value,
      "Country": document.getElementById("country").value,
      "Gender": getSelectedGenders(),
      "Profession": document.getElementById("profession").value,
      "Email": document.getElementById("email").value,
      "Mobile Number": document.getElementById("mobile").value,
    };
  
    displayPopup(formData);
    resetForm();
  }
  
  function getSelectedGenders() {
    const selectedGenders = [];
    if (document.getElementById("male").checked) {
      selectedGenders.push("Male");
    }
    if (document.getElementById("female").checked) {
      selectedGenders.push("Female");
    }
    return selectedGenders.join(", ");
  }
  
  function resetForm() {
    document.getElementById("survey-form").reset();
  }
  
  function displayPopup(formData) {
    const popup = document.getElementById("popup");
    const formContent = document.getElementById("form-data");
    formContent.innerHTML = "";
    for (const field in formData) {
      const label = document.createElement("strong");
      label.textContent = field + ": ";
      const value = document.createElement("span");
      value.textContent = formData[field];
      formContent.appendChild(label);
      formContent.appendChild(value);
      formContent.appendChild(document.createElement("br"));
    }
    popup.style.display = "block";
  }
  
  function closePopup() {
    const popup = document.getElementById("popup");
    popup.style.display = "none";
  }
  
  
  