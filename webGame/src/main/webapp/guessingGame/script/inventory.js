function loadInventory() {
	const inventory = JSON.parse(localStorage.getItem('inventory')) || [];
	return inventory;
}

function saveInventory(evidence) {
	const inventory = JSON.parse(localStorage.getItem('inventory')) || [];
	inventory.push(evidence);
	localStorage.setItem('inventory', JSON.stringify(inventory));
}

function resetInventory() {
  localStorage.removeItem('inventory');
}

function displayInventory() {
	const inventory = loadInventory();
	const inventoryList = document.getElementById('evidenceList');

	inventoryList.innerHTML = '';

	inventory.forEach(item => {
		const listItem = document.createElement('li');
		listItem.textContent = item;
		inventoryList.appendChild(listItem);
	});
}

document.addEventListener('DOMContentLoaded', () => {
	displayInventory();
});

