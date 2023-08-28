/**
 * 
 */
const radioButtons = document.querySelectorAll('input[name="role"]');
const selectedLanguage = document.getElementById('selectedLanguage');

radioButtons.forEach(radioButton => {
  radioButton.addEventListener('change', () => {
    selectedLanguage.textContent = radioButton.value;
  });
});