import { Injectable } from '@angular/core';
import { Quizformat } from '../quizdisplay/quizformat';

@Injectable({
  providedIn: 'root'
})
export class QuizcontentsService {

	path:string =""; 
	user_option = ["","","","","","","","","",""];
	cans = [];
	currentu ="";
   
	constructor() {}

	mymethod(data:string){
		this.path = data;
	}

	User_option_update(ind:number,data:string){
		this.user_option[ind] = data; 
	}

	UserPass:any[]=[
		{
			"Ufname":"sasi",
			"Ulname":"sai",
			"Umail":"abc@gmail.com",
			"Upass":"1234"

			
		},
		{
			"Ufname":"jyothi",
			"Ulname":"Naga",
			"Umail":"abcd@gmail.com",
			"Upass":"1234"
			
		}

	]

	gk_content:Quizformat[] = [
		{
			qid:"1",
			qtext:"Which animal is known as the 'Ship of the Desert",
			op1:"Elephant",
			op2:"camel",
			op3:"dog",
			op4:"Horse",
			ans:"camel"	
		},
		{
			qid:"2",
			qtext:"How many letters are there in english alphabet",
			op1:"26",
			op2:"10",
			op3:"20",
			op4:"16",
			ans:"26"
		},
		{
			qid:"3",
			qtext:"How many days are there in a week",
			op1:"10",
			op2:"11",
			op3:"7",
			op4:"30",
			ans:"7"
		},

		{
			qid:"4",
			qtext:"Rainbow consist of how many colours",
			op1:"4",
			op2:"3",
			op3:"7",
			op4:"All of the above",
			ans:"7"
		},
		{
			qid:"5",
			qtext:"How many days are there in an year",
			op1:"30",
			op2:"185",
			op3:"365",
			op4:"250",
			ans:"365"
		},
		{
			qid:"6",
			qtext:"How many minutes are there in an hour",
			op1:"60",
			op2:"30",
			op3:"72",
			op4:"None of these",
			ans:"60"
		},
		{
			qid:"7",
			qtext:"The human heart is",
			op1:"Neurogenic heart",
			op2:"Myogenic heart",
			op3:"Pulsating heart",
			op4:"Ampullary heart",
			ans:"Myogenic heart"
		},
		{
			qid:"8",
			qtext:"The blue colour of the clear sky is due to",
			op1:"Diffraction of light",
			op2:"Dispersion of light",
			op3:"Reflection of light",
			op4:"Refraction of light",
			ans:"Dispersion of light"
		},

		{
			qid:"9",
			qtext:"World’s highest railway bridge will be constructed on which river?",
			op1:"Ganga",
			op2:"Chenab",
			op3:"Yamuna",
			op4:"Kaveri",
			ans:"Chenab"
		},
		{
			qid:"10",
			qtext:"Which animal is known as the king of the jungle",
			op1:"tiger",
			op2:"lion",
			op3:"cheetha",
			op4:"horse",
			ans:"lion"
		}
	]

	tech_content:Quizformat[] = [
		{
			qid:"1",
			qtext:"HTML creates",
			op1:"static page",
			op2:"dynamic page",
			op3:"both",
			op4:"None",
			ans:"static page"
		},
		{
			qid:"2",
			qtext:"different data types in java script",
			op1:"Number",
			op2:"String",
			op3:"	Object",
			op4:"All",
			ans:"All"
		},
		{
			qid:"3",
			qtext:"what are different levels of CSS?",
			op1:"inline",
			op2:"internal",
			op3:"external",
			op4:"All",
			ans:"All"
		},
		{
			qid:"4",
			qtext:"Regular expression in js is?",
			op1:"Object",
			op2:"string",
			op3:"number",
			op4:"boolean",
			ans:"Object"
		},
		{
			qid:"5",
			qtext:"Which is a variable declaration in js?",
			op1:"var a",
			op2:"int a",
			op3:"char a",
			op4:"float a",
			ans:"var a"
		},
		{
			qid:"6",
			qtext:"how to create file in angular?",
			op1:"ng filename",
			op2:"ng new filename",
			op3:"ng",
			op4:"new filename",
			ans:"ng new filename"
		},
		{
			qid:"7",
			qtext:"Which is object oriented programming language?",
			op1:"HTML",
			op2:"CSS",
			op3:"java",
			op4:"c",
			ans:"java"
		},
		{
			qid:"8",
			qtext:"how many keywords are there in c?",
			op1:"54",
			op2:"15",
			op3:"32",
			op4:"68",
			ans:"32"
		},
		{
			qid:"9",
			qtext:"In which year c was invented?",
			op1:"1976",
			op2:"1988",
			op3:"1988",
			op4:"1972",
			ans:"1972"
		},
		{
			qid:"10",
			qtext:"howw many operators are there in c?",
			op1:"4",
			op2:"6",
			op3:"8",
			op4:"9",
			ans:"8"
		}
	]

	appti_content:Quizformat[] = [
		{
			qid:"1",
			qtext:"A train 125 m long passes a man, running at 5 km/hr in the same direction in which the train is going, in 10 seconds. The speed of the train is:",
			op1:"45 km/hr",
			op2:"50 km/hr",
			op3:"54 km/hr",
			op4:"55 km/hr",
			ans:"50 km/hr"
		},
		{
			qid:"2",
			qtext:"An aeroplane covers a certain distance at a speed of 240 kmph in 5 hours. To cover the same distance in 1 hours, it must travel at a speed of:",
			op1:"300 kmph",
			op2:"360 kmph",
			op3:"600 kmph",
			op4:"720 kmph",
			ans:"720 kmph"
		},
		{
			qid:"3",
			qtext:"The angle of elevation of a ladder leaning against a wall is 60Â° and the foot of the ladder is 4.6 m away from the wall. The length of the ladder is:",
			op1:"2.3 m",
			op2:"4.6 m",
			op3:"7.8 m",
			op4:"9.2 m",
			ans:"9.2 m"
		},
		{
			qid:"4",
			qtext:"A, B and C can do a piece of work in 20, 30 and 60 days respectively. In how many days can A do the work if he is assisted by B and C on every third day?",
			op1:"12 days",
			op2:"15 days",
			op3:"16 days",
			op4:"18 days",
			ans:"15 days"
		},
		{
			qid:"5",
			qtext:"A sum of money at simple interest amounts to Rs. 815 in 3 years and to Rs. 854 in 4 years. The sum is:",
			op1:"Rs. 650",
			op2:"Rs. 690",
			op3:"Rs. 698",
			op4:"Rs. 700",
			ans:"Rs. 698",
		},
		{
			qid:"6",
			qtext:"The difference between simple and compound interests compounded annually on a certain sum of money for 2 years at 4% per annum is Re. 1. The sum (in Rs.) is:",
			op1:"625",
			op2:"630",
			op3:"640",
			op4:"650",
			ans:"625"
		},
		{
			qid:"7",
			qtext:"The cost price of 20 articles is the same as the selling price of x articles. If the profit is 25%, then the value of x is:",
			op1:"15",
			op2:"16",
			op3:"18",
			op4:"25",
			ans:"16"
		},
		{
			qid:"8",
			qtext:"A, B, C subscribe Rs. 50,000 for a business. A subscribes Rs. 4000 more than B and B Rs. 5000 more than C. Out of a total profit of Rs. 35,000, A receives:",
			op1:"Rs. 8400",
			op2:"Rs. 11,900",
			op3:"Rs. 13,600",
			op4:"Rs. 14,700",
			ans:"Rs. 14,700"
		},
		{
			qid:"9",
			qtext:"Two students appeared at an examination. One of them secured 9 marks more than the other and his marks was 56% of the sum of their marks. The marks obtained by them are:",
			op1:"39, 30",
			op2:"41, 32",
			op3:"42, 33",
			op4:"43, 34",
			ans:"42, 33"
		},
		{
			qid:"10",
			qtext:"The sum of ages of 5 children born at the intervals of 3 years each is 50 years. What is the age of the youngest child?",
			op1:"4 years",
			op2:"8 years",
			op3:"10 years",
			op4:"None of these",
			ans:"4 years",
		}
	]
}
