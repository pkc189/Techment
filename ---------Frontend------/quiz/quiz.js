const quizQuestion = [
  {
    question: "What does a Data Type in Java refers to?",
    answers: {
      a: "The place where data is stored",
      b: "The technique how data is retreived",
      c: "The type or variety of data being handled for reading and writing",
    },
    correctAnswer: "c",
  },
  {
    question: "which among the following is not a Data Type in Java?",
    answers: {
      a: "short",
      b: "int",
      c: "long double",
    },
    correctAnswer: "c",
  },
  {
    question: " What is the size of an INT integer in Java?",
    answers: {
      a: "2 bytes",
      b: "4 bytes",
      c: "6 bytes",
      d: "8 bytes",
    },
    correctAnswer: "b",
  },
];

const quizContainer = document.getElementById("quiz");
const resultsContainer = document.getElementById("results");
const submitButton = document.getElementById("submit");

function constructingQuiz() {
  const output = [];

  quizQuestion.forEach((currentQuestion, questionNumber) => {
    const answers = [];

    for (key in currentQuestion.answers) {
      answers.push(
        `<label>
                <input type="radio" name="question${questionNumber}" value="${key}">
                ${key} :
                ${currentQuestion.answers[key]}
              </label><br/>`
      );
    }

    output.push(
      `<div class="slide">
              <div class="question " style="line-height:1.5"> ${
                currentQuestion.question
              } </div>
              <div class="answers"> ${answers.join("")} </div>
            </div>`
    );
  });

  quizContainer.innerHTML = output.join("");
}

function results() {
  const answerContainers = quizContainer.querySelectorAll(".answers");

  let numCorrect = 0;

  quizQuestion.forEach((currentQuestion, questionNumber) => {
    const answerContainer = answerContainers[questionNumber];
    const selector = `input[name=question${questionNumber}]:checked`;
    const userAnswer = (answerContainer.querySelector(selector) || {}).value;

    if (userAnswer === currentQuestion.correctAnswer) {
      numCorrect++;

      answerContainers[questionNumber].style.color = "green";
      // answerContainers[questionNumber].classList.add("text-success");
    } else {
      answerContainers[questionNumber].style.color = "red";
    }
  });

  resultsContainer.innerHTML = `Result : ${numCorrect} out of ${quizQuestion.length}`;
}

// Kick things off
constructingQuiz();

submitButton.addEventListener("click", results);
