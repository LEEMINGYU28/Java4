
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
        addEvidenceList(randomEvidence);
        evidenceFound = true;
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

