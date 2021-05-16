function defmorse() {

	morselu={ itu:[], amc:[] };

	// Modern International ITU Morse

	morselu.itu[" "]="/";	// Specials (for operation of program)
	morselu.itu["<"]="<";	// Specials (for operation of program)
	morselu.itu[">"]=">";	// Specials (for operation of program)

	morselu.itu["A"]=".-";
	morselu.itu["B"]="-...";
	morselu.itu["C"]="-.-.";
	morselu.itu["D"]="-..";
	morselu.itu["E"]=".";
	morselu.itu["F"]="..-.";
	morselu.itu["G"]="--.";
	morselu.itu["H"]="....";
	morselu.itu["I"]="..";
	morselu.itu["J"]=".---";
	morselu.itu["K"]="-.-";
	morselu.itu["L"]=".-..";
	morselu.itu["M"]="--";
	morselu.itu["N"]="-.";
	morselu.itu["O"]="---";
	morselu.itu["P"]=".--.";
	morselu.itu["Q"]="--.-";
	morselu.itu["R"]=".-.";
	morselu.itu["S"]="...";
	morselu.itu["T"]="-";
	morselu.itu["U"]="..-";
	morselu.itu["V"]="...-";
	morselu.itu["W"]=".--";
	morselu.itu["X"]="-..-";
	morselu.itu["Y"]="-.--";
	morselu.itu["Z"]="--..";

	morselu.itu["0"]="-----";
	morselu.itu["1"]=".----";
	morselu.itu["2"]="..---";
	morselu.itu["3"]="...--";
	morselu.itu["4"]="....-";
	morselu.itu["5"]=".....";
	morselu.itu["6"]="-....";
	morselu.itu["7"]="--...";
	morselu.itu["8"]="---..";
	morselu.itu["9"]="----.";
	
	morselu.itu["."]=".-.-.-";	// Punctuation Period [.]
	morselu.itu[","]="--..--";	// Punctuation Comma [,]
	morselu.itu["?"]="..--..";	// Punctuation Question Mark [?]
	morselu.itu["'"]=".----.";	// Punctuation Apostrophe [']
	morselu.itu["!"]="-.-.--";	// Punctuation Exclamation [!]
	morselu.itu["/"]="-..-.";	// Punctuation Slash/Fraction Bar [/]
	morselu.itu["("]="-.--.";	// Punctuation Parenthesis (Open)
	morselu.itu[")"]="-.--.-";	// Punctuation Parenthesis (Close)
	morselu.itu["&"]=".-...";	// Punctuation Ampersand (or Wait) [&]
	morselu.itu[":"]="---...";	// Punctuation Colon [:]
	morselu.itu[";"]="-.-.-.";	// Punctuation Semicolon [;]
	morselu.itu["="]="-...-";	// Punctuation Double Dash [=]
	morselu.itu["+"]=".-.-.";	// Punctuation Plus sign [+]
	morselu.itu["-"]="-....-";	// Punctuation Hyphen [-]
	morselu.itu["_"]="..--.-";	// Punctuation Underscore [_]
	morselu.itu["\""]=".-..-.";	// Punctuation Quotation mark ["]
	morselu.itu["$"]="...-..-";	// Punctuation Dollar sign [$]
	morselu.itu["@"]=".--.-.";	// Punctuation At Sign [@]

	morselu.itu["À"]=".--.-";	// Non-English extensions 
	morselu.itu["Ä"]=".-.-";	// Non-English extensions 
	morselu.itu["Å"]=".--.-";	// Non-English extensions 
	morselu.itu["Ą"]=".-.-";	// Non-English extensions 
	morselu.itu["Æ"]=".-.-";	// Non-English extensions 
	morselu.itu["Ć"]="-.-..";	// Non-English extensions 
	morselu.itu["Ĉ"]="-.-..";	// Non-English extensions 
	morselu.itu["Ç"]="-.-..";	// Non-English extensions 
	morselu.itu["Đ"]="..-..";	// Non-English extensions 
	morselu.itu["Ð"]="..--.";	// Non-English extensions 
	morselu.itu["É"]="..-..";	// Non-English extensions 
	morselu.itu["È"]=".-..-";	// Non-English extensions 
	morselu.itu["Ę"]="..-..";	// Non-English extensions 
	morselu.itu["Ĝ"]="--.-.";	// Non-English extensions 
	morselu.itu["Ĥ"]="----";	// Non-English extensions 
	morselu.itu["Ĵ"]=".---.";	// Non-English extensions 
	morselu.itu["Ł"]=".-..-";	// Non-English extensions 
	morselu.itu["Ń"]="--.--";	// Non-English extensions 
	morselu.itu["Ñ"]="--.--";	// Non-English extensions 
	morselu.itu["Ó"]="---.";	// Non-English extensions 
	morselu.itu["Ö"]="---.";	// Non-English extensions 
	morselu.itu["Ø"]="---.";	// Non-English extensions 
	morselu.itu["Ś"]="...-...";	// Non-English extensions 
	morselu.itu["Ŝ"]="...-.";	// Non-English extensions 
	morselu.itu["Š"]="----";	// Non-English extensions 
	morselu.itu["Þ"]=".--..";	// Non-English extensions 
	morselu.itu["Ü"]="..--";	// Non-English extensions 
	morselu.itu["Ŭ"]="..--";	// Non-English extensions 
	morselu.itu["Ź"]="--..-.";	// Non-English extensions 
	morselu.itu["Ż"]="--..-";	// Non-English extensions 

	// Old American/Railroad Morse (standardised)

	morselu.amc[" "]="/";	// Specials (for operation of program)
	morselu.amc["<"]="<";	// Specials (for operation of program)
	morselu.amc[">"]=">";	// Specials (for operation of program)

	morselu.amc["A"]=".-";
	morselu.amc["B"]="-...";
	morselu.amc["C"]="..Δ.";
	morselu.amc["D"]="-..";
	morselu.amc["E"]=".";
	morselu.amc["F"]=".-.";
	morselu.amc["G"]="--.";
	morselu.amc["H"]="....";
	morselu.amc["I"]="..";
	morselu.amc["J"]="-.-.";
	morselu.amc["K"]="-.-";
	morselu.amc["L"]="=";
	morselu.amc["M"]="--";
	morselu.amc["N"]="-.";
	morselu.amc["O"]=".Δ.";
	morselu.amc["P"]=".....";
	morselu.amc["Q"]="..-.";
	morselu.amc["R"]=".Δ..";
	morselu.amc["S"]="...";
	morselu.amc["T"]="-";
	morselu.amc["U"]="..-";
	morselu.amc["V"]="...-";
	morselu.amc["W"]=".--";
	morselu.amc["X"]=".-..";
	morselu.amc["Y"]="..Δ..";
	morselu.amc["Z"]="...Δ.";

	morselu.amc["0"]="≡";
	morselu.amc["1"]=".--.";
	morselu.amc["2"]="..-..";
	morselu.amc["3"]="...-.";
	morselu.amc["4"]="....-";
	morselu.amc["5"]="---";
	morselu.amc["6"]="......";
	morselu.amc["7"]="--..";
	morselu.amc["8"]="-....";
	morselu.amc["9"]="-..-";
	
	morselu.amc["."]="..--..";	// Punctuation Period [.]
	morselu.amc[","]=".-.-";	// Punctuation Comma [,]
	morselu.amc["?"]="-..-.";	// Punctuation Question Mark [?]
	morselu.amc["!"]="---.";	// Punctuation Exclamation [!]
	morselu.amc["&"]=".Δ...";	// Punctuation Ampersand [&]

}