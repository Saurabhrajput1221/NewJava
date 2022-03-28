//  call method...

// let Ajay = {
//   name: "Ajay",
//   English: 78,
//   Math: 89,
//   feature: function () {
//     return `${this.name} having good marks in english ${this.English} and also having good marks in Mathematics ${this.Math}`;
//   },
// };
// // let B = Ajay.feature()
// // console.log(B)

// let sushant = {
//   name: "sushant",
//   English: 75,
//   Math: 88,
// };

// let A = Ajay.feature.call(sushant);
// console.log(A);



/******************************/
//  apply method...
//  Example No 1
// let Ajay = {
//   name: "Ajay",
//   English: 78,
//   Math: 89,
//   feature: function () {
//     return `${this.name} having good marks in english ${this.English} and also having good marks in Mathematics ${this.Math}`;
//   },
// };
// // let B = Ajay.feature()
// // console.log(B)

// let sushant = {
//   name: "sushant",
//   English: 75,
//   Math: 88,
// };

// let A = Ajay.feature.call(sushant);
// console.log(A);


//  Example No 2

// let Krushna = {
//     Name:'krushna',
//     Math:88,
//     Engilsh:99,
//     body: function(sport, drama){
//         return (`${this.Name} having good marks in math ${this.Math} and  English${this.Engilsh} and active in ${sport} and ${drama}`)
//     }
// }
// let Mayur = {
//     Name:'Mayur',
//     Math:78,
//     Engilsh:79
// }
// let R = Krushna.body.apply(Mayur, ['sport', "dram also"]);
// console.log(R)


/***********************************/
// bind method...
// let A ={
//     name:'aniket',
//     eyecolor:' black'
// }
// let B ={
//     name:'nitin',
//     eyecolor:' black'
// }
// let C ={
//     name:'javed',
//     eyecolor:' brown'
// }
// function func(){
//     console.log( `My name is ${this.name} and eyecolor is ${this.eyecolor}`)
// }

// let Output = func.bind(A)

// Output()
