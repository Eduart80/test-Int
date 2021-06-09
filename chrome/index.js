function enterText(){
    let entry = document.getElementById('textEntry').value;
       document.getElementById('AliceBlog').innerHTML = entry;
     document.getElementById('textEntry').value = '';
}