
foreach $line ( <STDIN> )
{
	$text .= $line;
}

$text =~ s/\d{3}-\d{2}-\d{4}/###-##-####/g;

print "$text";
