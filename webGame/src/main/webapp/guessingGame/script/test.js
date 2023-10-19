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
	let displayedStory = [];

	function displayStory() {
		if (storyIndex < story.length) {
			let paragraph = document.createElement("p");
			paragraph.textContent = story[storyIndex];
			if (storyIndex > 0 && outputElement.firstElementChild) {
				outputElement.removeChild(outputElement.firstElementChild);
			}
			outputElement.appendChild(paragraph);
			displayedStory.push(story[storyIndex]);
			storyIndex++;
		} else {
			clearInterval(interval);
		}
	}

	function previousStory() {
		if (displayedStory.length > 0) {
			storyIndex--;
			storyIndex = Math.max(storyIndex, 0);


			outputElement.innerHTML = '';


			let previousContent = displayedStory.pop();
			outputElement.innerHTML = '';
			if (previousContent) {
				let paragraph = document.createElement("p");
				paragraph.textContent = previousContent;
				outputElement.appendChild(paragraph);
			}
		}
	}
	/*function previousStory() {
		if (displayedStory.length > 0) {
			storyIndex--;
			storyIndex = Math.max(storyIndex, 0);

			
			displayedStory.pop();

			
			let previousContent = displayedStory.pop(); // 현재 내용과 함께 이전 내용을 가져옴
			outputElement.innerHTML = ''; // 내용 초기화
			if (previousContent) {
				let paragraph = document.createElement("p");
				paragraph.textContent = previousContent;
				outputElement.appendChild(paragraph);
			}
		}
	}*/
	function nextStory() {
		if (storyIndex < story.length) {
			displayedStory.push(story[storyIndex]);
			storyIndex++;
			if (storyIndex < story.length) {
				outputElement.innerHTML = '';
				let paragraph = document.createElement("p");
				paragraph.textContent = story[storyIndex];
				outputElement.appendChild(paragraph);
			}
		}
	}
	/*function nextStory() {
		if (storyIndex < story.length) {
			displayStory();
		displayedStory.push(story[storyIndex - 1]);
		}
	}*/

	let nextbtn = document.getElementById("nextbtn");
	nextbtn.addEventListener("click", nextStory);
	nextbtn.style.display = "none";

	let prevbtn = document.getElementById("prevbtn");
	prevbtn.addEventListener("click", previousStory);
	prevbtn.style.display = "none";

	function startStory() {
		storyIndex = 0;
		outputElement.innerHTML = '';
		displayedStory = [];
		displayStory();
		nextbtn.style.display = "inline";
		prevbtn.style.display = "inline";
	}

	let storybtn = document.getElementById("storybtn");
	storybtn.addEventListener("click", startStory);
});
