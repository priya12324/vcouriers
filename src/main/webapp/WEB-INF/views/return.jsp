<!DOCTYPE html>
<html>
<body>

<h2> Refund Request Form</h2>
<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=date],select{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<div>
<form action="/action_page.php" target="_blank" method="get">
  <label for="fname">First name:</label><br>
  <input type="text" id="fname" name="fname" ><br>
  <label for="lname">Last name:</label><br>
  <input type="text" id="lname" name="lname" ><br>
   <label for="fname">email:</label><br>
  <input type="text" id="email" name="email"><br>
     <label for="fname">request date:</label><br>
  <input type="date" id="date" name="request date" ><br>
  
  <h4>Reason for Return</h4>
  
<input type="radio" id="wrong delivery"  value="wrong delivery">
<label for="wrong delivery">Wrong Delivery</label><br>
<input type="radio" id="Excessive Amount"  value="wrong delivery">
<label for="Excessive Amount">Excessive Amount</label><br>

<input type="radio" id="late delivery"  value="wrong delivery">
<label for="late delivery">late Delivery</label><br><br>

 <label for="iname">Item name:</label><br>
  <input type="text" id="iname" name="iname" ><br><br>
  
   <label for="id">Item id:</label><br>
  <input type="number" id="id" value="id"><br><br>
  
    <label for="date">When did you buy the prouct:</label><br>
  <input type="date" id="date" name="request date" ><br><br>

  
   <label for="iname">Additional Notes
  <input type="text" id="iname" name="iname" ><br>

<p><h4>  Click on Submit to initiate Refund</h4></p>
    
  <input type="submit" value="Submit">

</form>
</div>

</body>
</html>