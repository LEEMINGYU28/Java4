$("#datePicker").datepicker({
    Format: "yyyy-mm-dd",
    // startDate:"-1d",
    endDate: "1d",
    autoclose: true,
    clearBtn: true,
    title: "Birth day",
    language: "ko",
    // multidate: true,
});


const idReg = /^[A-Za-z0-9]{3,20}$/i;
const pwReg = /^(?=.*[a-z])(?=.*[\!\@\#\$\%\^\&])(?=.*\d).{10,30}$/i;
const koreanReg = /[ㄱ-ㅎㅏ-ㅣ가-힇]/g;
const phoneReg = /^[0-9]{3}-[0-9]{3,4}-[0-9]{4}$/;
const emailReg = /^[A-Z0-9\.\_\%\+\-]+@[A-Z0-9\.\-]+(.com|.net|.co.kr|.org)$/i;
document.getElementById("regist-form").onsubmit = function (e) {

    const tempName = e.target.name.value.replace(koreanReg, "aa");
    const tempPhone = e.target.phone.value.replace(
        /^(\d{3})(\d{3,4})(\d{4})$/,
        `$1-$2-$3`);

    let msg = "";

    if (!idReg.test(e.target.userId.value)) {
        if (e.target.userId.value.length < 3 || e.target.userId.value.length > 20) {
            msg = "아이디의 길이는 3~20으로 해주세요.";
        } else {
            msg = "아이디는 영어와 숫자만 포함 할 수 있어요.";
        }
    } else if (!pwReg.test(e.target.password.value)) {
        if (e.target.password.value.length < 10 || e.target.password.value.length > 30) {
            msg = "비밀번호의 길이는 10~30으로 해주세요.";
        } else {
            msg = "비밀번호는 대소문자,숫자,특수문자(!@#$%^&)를 포함해야합니다";
        }
    } else if (tempName.length < 4 || tempName.length > 20) {
        msg = "이름의 길이는 한글 기준 2~10, 영어 기준 4~20으로 맞춰주세요."
    } else if (!phoneReg.test(tempPhone)) {
        msg = "전화번호는 한국에서의 형식에 맞춰주세요."
    } else if (
        e.target.address.value.length > 0 &&
        e.target.address.value.length < 5 || e.target.address.value.length > 100) {
        msg = "주소는 5~100자로 맞춰주세요."
    } else if (!emailReg.test(e.target.email.value)
    ) {
        msg = "이메일 형식에 맞춰주세요."
    }

    if (msg) {
        console.log(msg);
        e.preventDefault();
        document.getElementById("modal-container").classList.add("on");

        document.getElementById("modal-msg").innerHTML = msg;
    } else {
        e.target.phone.value = tempPhone;
        if (
            e.target["git-address"].value.length > 0 &&
            !e.target["git-address"].value.startsWith("https://github.com/")
        ) {
            e.target["git-address"].value =
                "https://github.com/" + e.target["git-address"].value;
        }
    }
};    