
const evidences = [
	"피해자핸드폰",
	"피해자핸드폰 비밀번호 '0828'",
	"피해자 방 열쇠",
	"찢어진 옷 조각",
	"피해자의 일기"
];


let initialEvidences = [...evidences];
let evidenceLocation = null;
let evidenceFound = false;

document.addEventListener("DOMContentLoaded", function() {
	const roomDescription = document.getElementById("roomDescription");
	const sentence = document.getElementById("sentence");
	const closeButton = document.getElementById("closebtn");

	sentence.innerHTML = "3번방 투숙객은 예술적인 분위기를 풍기고 있었다.<br>피해자는 자신 작품에 대한 소중한 비평가였다고 한다.<br><br>단서가 있는지 조사해보자.";
	closebtn.style.display = "block";
	closeButton.addEventListener("click", function() {
		roomDescription.style.display = "none";
	});

	const bedBtn = document.getElementById("bedbtn");
	const tableBtn = document.getElementById("tablebtn");
	const photoBtn = document.getElementById("photobtn");

	bedBtn.addEventListener("click", () => randomEvidence(0));
	tableBtn.addEventListener("click", () => randomEvidence(1));
	photoBtn.addEventListener("click", () => randomEvidence(2));

	shuffleArray(evidences);
	evidenceLocation = Math.floor(Math.random() * 3);
	evidenceFound = false;
});

function shuffleArray(array) {
	for (let i = array.length - 1; i > 0; i--) {
		const j = Math.floor(Math.random() * (i + 1));
		[array[i], array[j]] = [array[j], array[i]];
	}
}

function randomEvidence(selectedLocationIndex) {
	if (selectedLocationIndex === evidenceLocation) {
		const randomEvidence = evidences.pop();
		alert("단서를 발견했다: " + randomEvidence);
		
		saveInventory(randomEvidence);
		addEvidenceList(randomEvidence);
		evidenceFound = true;

		localStorage.setItem('evidenceLocation', evidenceLocation);
		localStorage.setItem('evidenceFound', evidenceFound);

	} else {
		alert("아무것도 안보인다.");
	}
}

function addEvidenceList(evidence) {
	const evidenceList = document.getElementById("evidenceList");
	const evidenceItemInList = document.createElement("li");
	evidenceItemInList.textContent = evidence;
	evidenceList.appendChild(evidenceItemInList);
}