const calculator = document.getElementById('calculator');

// Create input/display
const inputContainer = document.createElement('div');
inputContainer.classList.add('input-container');

const display = document.createElement('input');
display.setAttribute('id', 'display');
display.setAttribute('readonly', true);

inputContainer.appendChild(display);
calculator.appendChild(inputContainer);

//Memory Display
let memory = 0;
const memoryDisplay = document.createElement('p');
memoryDisplay.setAttribute('id', 'memoryDisplay');
memoryDisplay.style.fontSize = '14px';
memoryDisplay.style.textAlign = 'right';
memoryDisplay.style.marginTop = '8px';
memoryDisplay.style.color = '#666';

inputContainer.appendChild(memoryDisplay);

// Buttons list
const buttons = [
  '7', '8', '9', '+',
  '4', '5', '6', '-',
  '1', '2', '3', '*',
  '0', '00', '%', '/',
  'M+','M-','MC','Del',
  '.', 'C','='
];

const buttonsContainer = document.createElement('div');
buttonsContainer.setAttribute('id', 'buttonsContainer');
calculator.appendChild(buttonsContainer);

// Create buttons
buttons.forEach(label => {
  const btn = document.createElement('button');
  btn.textContent = label;
  btn.classList.add('btn', 'btn-secondary');

  if (label === '=') {
    btn.classList.add('equal-btn'); // Special class for the = button
  }

  btn.addEventListener('click', () => handleInput(label));
  buttonsContainer.appendChild(btn);
});

function handleInput(value) {
  if (value === 'C') {
    display.value = '';
  } else if (value === '=') {
    try {
      display.value = eval(display.value);
    } catch {
      alert('Invalid Expression');
    }
  } else if(value === 'Del'){
    display.value = display.value.slice(0,-1);
  }else if (value === 'M+') {
    memory += parseFloat(display.value) || 0;
  } else if (value === 'M-') {
    memory -= parseFloat(display.value) || 0;
  } else if (value === 'MC') {
    memory = 0;
  }
  else {
    display.value += value;
  }

  // Update memory display after every click
  memoryDisplay.textContent = `Memory: ${memory}`;
}

// Keyboard Support some keys only
document.addEventListener('keydown', (e) => {
  if ((e.key >= '0' && e.key <= '9') || ['+', '-', '*', '/', '%', '.'].includes(e.key)) {
    display.value += e.key;
  } else if (e.key === 'Enter') {
    handleInput('=');
  } else if (e.key === 'Backspace') {
    display.value = display.value.slice(0, -1);
  } else if (!['Shift', 'Control', 'Alt', 'Tab'].includes(e.key)) {
    alert("Only numbers are allowed");
  }
});
