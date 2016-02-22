function processData(input) {
    var arr = input.split('\n');
    var n = 0;
    var answer = 0;
    var counts = [];
    var iters = [];
    var letters = [];
    var iter = 0;
    for(var element of arr){
       if(isNaN(element)){
          var ar = element.split('');
        //ya tengo arreglo de letras de cada palabra
          for(var i=0; i<ar.length; i++){
            var posi = letters.indexOf(ar[i]);
            if(posi<0 && iter=== 0){
                letters.push(ar[i]);
                counts.push(1);
                iters.push(iter);
            }
            else if(posi>=0 && iter!== iters[posi]){
                //solo si es otra iteracion, aumentar su contador
                counts[posi]++;
                iters[posi] = iter;
              
            }
          }
       iter++;
       }
       else{
        n = element;
       }
    }
    
    for(var count of counts){
        if(count == n){
            
            answer++;
        }
    }
  
    console.log(answer);

}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
