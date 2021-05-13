<!DOCTYPE HTML>
<html>
<body>
<?php
$jan1 = 100;
$jan2 = 431;
$jan3 = 600;
$feb1 = 2302;
$feb2 = 1630;
$feb3 = 900;
$mar1 = 50;
$mar2 = 354;
$mar3 = 871;
?>
<h2 style="text-align:center;">PHP PAGE</h2>
<p style="text-align:center;">Eren Elmas</p>

<table style="width:30%;" border="1px">
<caption>Salary</caption>
  <tr>
    <th>January</th>
    <th>February</th> 
    <th>March</th>
  </tr>
  <tr style="">
    <td><?php echo $jan1 ?></td>
    <td><?php echo $feb1 ?></td>
    <td><?php echo $mar1 ?></td>
  </tr>
  <tr>
    <td><?php echo $jan2 ?></td>
    <td><?php echo $feb2 ?></td>
    <td><?php echo $mar2 ?></td>
  </tr>
  <tr>
    <td><?php echo $jan3 ?></td>
    <td><?php echo $feb3 ?></td>
    <td><?php echo $mar3 ?></td>
  </tr>
  <tr>
    <td><?php echo $jan1+$jan2+$jan3 ?></td>
	<td><?php echo $feb1+$feb2+$feb3 ?></td>
	<td><?php echo $mar1+$mar2+$mar3 ?></td>
	<td><?php echo "<-TOTAL" ?></td>
  </tr>
</table>


</body>
</html>