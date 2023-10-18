/**
 * 
 */
let story = [
	"호텔 입구에 도착했다. 경비원이 당시 상황을 얘기해주며,맞이 해준다.",
	"나는 호텔에 CCTV는 없었는지 가장먼저 물어보았다.",
	"경비원 :CCTV는 몇일전에 고장이 나서 수리중에 있었습니다.",
	"아쉬움을 뒤로하고 수사를 위해 1번방으로 들어간다."
];
document.addEventListener("DOMContentLoaded", function() {
	let storyIndex = 0;
	let outputElement = document.getElementById("output");

	function displayStory() {
		if (storyIndex < story.length) {
			let paragraph = document.createElement("p");
			paragraph.textContent = story[storyIndex];
			if (storyIndex > 0) {
				outputElement.removeChild(outputElement.firstElementChild);
			}
			outputElement.appendChild(paragraph);
			storyIndex++;
		} else {
			clearInterval(interval);
		}
	}
	function nextStory() {
		if (storyIndex < story.length) {
			displayStory();
		}
	}
	var nextbtn = document.getElementById("nextbtn");
	nextbtn.addEventListener("click", nextStory);
	nextbtn.style.display = "none";
	
	var room1 = document.getElementById("room1");
	room1.addEventListener("click", nextStory);
	room1.style.display = "none";

	var boanbtn = document.getElementById("boanbtn");
	boanbtn.addEventListener("click", startStory);
	
	function startStory() {
		storyIndex = 0;
		outputElement.innerHTML = '';
		displayStory();
		nextbtn.style.display = "inline";
		room1.style.display = "inline";
		outputElement.style.backgroundColor = "#ffffffc9";
	}


});