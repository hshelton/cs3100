
foreach $line ( <STDIN> )
{
	$text .= $line;
}

$text =~ s/\/\/.*//g;

print "$text";
