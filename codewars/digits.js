function unusedDigits(){
  var arrUnused = [true, false, false, false, false, false, false, false, false, true];
  //decompose numbers into digits 
  //for each digit, make it false in the array by index 
  //in the end, traverse arrUnused and make a string of the unused digits
  
  var result = "";
  for(var i=0; i<10; i++){
    if(unusedDigits[i]) console.log(i);
    
  }
  console.log(result);
}


unusedDigits();