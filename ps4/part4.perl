foreach $line ( <STDIN> )
{
	$text .= $line;
}

($output) = $text =~ m/(\".*(?<!\\)\")/g;

print "$output \n";
