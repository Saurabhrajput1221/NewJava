// Async_await Example...


let Obj1 = new Promise ((resolve, reject )=>{
    setTimeout(() => {
        let rollno= [1,2,3,4,5,6,7];
        resolve(rollno)
    },2000);
})

let Obj2 = (()=>{
    return new Promise ((resolve, reject)=>{
        setTimeout(() => {
            let biodata ={
                name:'vinod',
                age:26
            }
            resolve(`My name is ${biodata.name} and I am ${biodata.age} year old...`)
        }, 2000);
    })
})


async function getdata(){
    let Obj1data = await Obj1
    console.log(Obj1data)

    let Obj2data = await  Obj2()
    console.log(Obj2data)
}
getdata();