
foreach $line ( <STDIN> )
{
	$text .= $line;
}

$number = () = $text=~ /\(\d{3}\) \d{3}-\d{3}/g;

print "$number\n";
