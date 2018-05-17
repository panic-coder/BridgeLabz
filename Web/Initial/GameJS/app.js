var scores;
var roundScore;
var activePlayer;
var gamePlaying;
var previousScore = 0;
var input = 20;

init();

//dice = Math.floor(Math.random()*6) + 1;
//console.log(dice);
//document.querySelector('#current-' + activePlayer).textContent = dice;
//var x = document.querySelector('#score-0').textContent;
//console.log(x);
function winnerScore(){
  if(input!=null){
    input = document.getElementById("userInput").value;
  }
  else {
    input  = 20;
  }
  document.querySelector('.btn-enter').style.display = 'none';
  document.querySelector('.in-value').style.display = 'none';
  console.log(input);
}

document.querySelector('.btn-roll').addEventListener('click',function(){

  if (gamePlaying) {
    //Random Number
    var dice = Math.floor(Math.random()*6) + 1;

    //Display
    var diceDOM = document.querySelector('.dice');
    diceDOM.style.display = 'block';
    diceDOM.src = 'dice-'+ dice +'.png'

    //Update

    if((dice === previousScore) && (previousScore === 6) ){
      scores[activePlayer] = 0;
      document.querySelector('#score-' + activePlayer).textContent = scores[activePlayer];
    }
  else  if (dice !== 1) {
      roundScore += dice;
      document.querySelector('#current-' + activePlayer).textContent = roundScore;

        } else {
        //Next Player
        nextPlayer();
    }
      previousScore = dice;
  }

});

document.querySelector('.btn-hold').addEventListener('click',function(){

  if (gamePlaying) {

        // Current to Global Score
        scores[activePlayer] += roundScore;

        // Update the UI
        document.querySelector('#score-' + activePlayer).textContent = scores[activePlayer];

        // Check the winner
        if (scores[activePlayer] >= input) {
          document.querySelector('#name-' + activePlayer).textContent = 'Winner!';
          document.querySelector('.dice').style.display = 'none';
          document.querySelector('.player-' + activePlayer + '-panel').classList.add('winner') ;
          document.querySelector('.player-' + activePlayer + '-panel').classList.remove('active') ;
          gamePlaying = false;
        }else {
          nextPlayer();
        }

  }

});

function nextPlayer() {
  activePlayer === 0 ? activePlayer = 1 : activePlayer = 0;
  roundScore = 0;

  document.getElementById('current-0').textContent = '0';
  document.getElementById('current-1').textContent = '0';

  //console.log(document.querySelector('div.player-0-panel').classList);
  document.querySelector('.player-0-panel').classList.toggle('active');
  document.querySelector('.player-1-panel').classList.toggle('active');

  document.querySelector('.dice').style.display = 'none';
}

document.querySelector('.btn-new').addEventListener('click',init);

function init(){
  scores = [0,0];
  roundScore = 0;
  activePlayer = 0;
  gamePlaying = true;

  document.querySelector('.dice').style.display = 'none';

  document.getElementById('score-0').textContent = 0;
  document.getElementById('score-1').textContent = 0;
  document.getElementById('current-0').textContent = 0;
  document.getElementById('current-1').textContent = 0;
  document.querySelector('#name-0').textContent = 'Player 1';
  document.querySelector('#name-1').textContent = 'Player 2';
  document.querySelector('.player-0-panel').classList.remove('winner') ;
  document.querySelector('.player-1-panel').classList.remove('winner') ;
  document.querySelector('.player-0-panel').classList.remove('active') ;
  document.querySelector('.player-1-panel').classList.remove('active') ;
  document.querySelector('.player-0-panel').classList.add('active') ;
}
