let boxes=document.querySelectorAll(".box");
let resetBtn=document.querySelector("#reset-btn");
let newGameBtn=document.querySelector("#new-btn");
let msgContainer=document.querySelector(".msg-container");
let msg=document.querySelector("#msg");

let turnO=true;//playerX,playerO

const winPatterns=[
    [0,1,2],
    [0,3,6],
    [0,4,8],
    [1,4,7],
    [2,5,8],
    [2,4,6],
    [3,4,5],
    [6,7,8],
];

boxes.forEach((box)=>{
    box.addEventListener("click",()=>{
        console.log("box clicked");
        if(turnO==true){
            //playerO
            box.innerHTML="O";
            turnO=false;
        }else{
            //playerX
            box.innerHTML="X";
            turnO=true;
        }
        box.disabled=true;
        checkWinner();
    });
});
const checkWinner=()=>{
    let winner=null;
    for(let i=0;i<winPatterns.length;i++){
        let winPattern=winPatterns[i];
        let a=boxes[winPattern[0]].innerHTML;
        let b=boxes[winPattern[1]].innerHTML;
        let c=boxes[winPattern[2]].innerHTML;
        if(a==""||b==""||c==""){
            continue;
        }
        if(a==b&&b==c){
            winner=a;
            break;
        }
    }
    if(winner==null){
        console.log("No winner");
    }else{
        console.log(winner+" is the winner");
        showWinner(winner);
        boxes.forEach((box)=>{
            box.disabled=true;
        });
    }
}
const disableBoxes=()=>{
    for(let box of boxes){
        box.disabled=true;
    }
}
const enableBoxes=()=>{
    for(let box of boxes){
        box.disabled=false;
        box.innerHTML="";
    }
}
const showWinner=(winner)=>{
    msg.innerHTML=" Congratulations,Player "+winner+" won!";
    msgContainer.classList.remove("hide");
    disableBoxes();
}
const resetGame=()=>{
    turnO=true;
    enableBoxes();
    msgContainer.classList.add("hide");
}
newGameBtn.addEventListener("click",resetGame);
resetBtn.addEventListener("click",resetGame);