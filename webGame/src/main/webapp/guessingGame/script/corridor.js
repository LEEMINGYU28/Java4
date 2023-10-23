document.addEventListener("DOMContentLoaded", function() {

   const evidenceLocationInCorridor = localStorage.getItem('evidenceLocation');
   const evidenceFoundInCorridor = localStorage.getItem('evidenceFound');
   
   if (evidenceLocationInCorridor !== null && evidenceFoundInCorridor !== null) {
   
      console.log("발견했는가: " + evidenceFoundInCorridor);

         if (evidenceFoundInCorridor) {
			 
         const evidenceList = document.getElementById('evidenceList');
         const evidenceItemInList = document.createElement('li');
         evidenceItemInList.textContent = "1번방 단서: " + initialEvidences[evidenceLocationInCorridor];
         evidenceList.appendChild(evidenceItemInList);
      }
   } else {
      console.log("오류");
   }
});