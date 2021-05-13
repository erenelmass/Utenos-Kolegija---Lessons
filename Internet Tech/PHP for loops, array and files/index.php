<!DOCTYPE HTML>
<html>
<body>
<?php
$numbers = array();
for($x=0; $x < 20; $x++){  //creating the array using for loop
  $numbers[$x] = $x;
}
sort($numbers);/*
$clength = count($numbers);
echo "numbers array has: ";
for($x=0; $x < $clength; $x++){
  echo $numbers[$x];
  echo " ";
}*/

$myfile = fopen("mas.txt","w") or die("unable to open file!");
for($x=0; $x < 20; $x++){
  fwrite($myfile,$numbers[$x]);                 //writing the elements to the 'mas.txt' file
  fwrite($myfile,"\n");
}
fclose($myfile);

$myfile = fopen("mas.txt","r") or die("unable to open file!");
echo "<br>mas.txt file has: ";
echo fread($myfile,filesize("mas.txt"));

$file = fopen("mas.txt","r");
echo "<br>first 10 element of the file: ";      //displaying the first 10 element
for($x=0; $x < 10; $x++){
  echo fgets($file);
}

$lastFile = "mas.txt";
$lines = file($lastFile);
echo "<br>last 10 element of the file (descending): ";      //displaying the last 10 element by descending
$lines = array_reverse($lines);
for($x=0; $x<10; $x++){
  echo $lines[$x];
}

$sumOfArray = array_sum($numbers);
echo "<br>sum of the numbers array: " . $sumOfArray;
$myfile2 = fopen("sum.txt","w") or die("unable to open file!");     //calculating the sum of array elements and writing them to the file 'sum.txt'
fwrite($myfile2,$sumOfArray);

fclose($myfile);
fclose($myfile2);
?>
</body>
</html>