/**
 * 
 */
let story =
	["방이 5개가 있는 호텔에서 살인사건이 일어났다.",
		"당시 투숙객은 피해자까지 5명이 있었으며, 모두 투숙객의 친구이다.",
		"호텔 경비를 맡고있는 경비원 1명까지 호텔에는 총 6명이 있었다.",
		"피해자는 5번방인 자기방에서 죽어있었다.",
		"플레이어는 방을 돌면서 각 방마다 단서를 랜덤으로 획득 할 수 있으며,",
		"단서는 총 5개 투숙객들과의 대화를 통해 용의자를 추려 낼 수 있다.",
		"단서는 인벤토리에 보관할 수 있다.",
		"단서 5개를 모두 찾았으면 모은 단서들로 범인을 찾아낸다.",
		"게임시작 클릭"];
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
	/*var interval = setInterval(displayStory, 2000);*/
	function nextStory() {
		if (storyIndex < story.length) {
			displayStory();
		}
	}
	var nextbtn = document.getElementById("nextbtn");
	nextbtn.addEventListener("click", nextStory);
	nextbtn.style.display = "none";

	function startStory() {
		storyIndex = 0;
		outputElement.innerHTML = '';
		displayStory();
		nextbtn.style.display = "inline";
		outputElement.style.backgroundColor = "#ffffffc9";
	}

	var storybtn = document.getElementById("storybtn");
	storybtn.addEventListener("click", startStory);
});
