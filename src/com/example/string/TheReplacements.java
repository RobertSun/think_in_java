/**
 * Filename:    TheReplacements.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2013-6-9 下午2:10:52
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2013-6-9     Robert Sun     1.0         1.0 Version
 */
package com.example.string;

//: strings/TheReplacements.java
import java.util.regex.*;

/*! Here’s a block of text to use as input to
  the regular expression matcher. Note that we’ll
  first extract the block of text by looking for
  the special delimiters, then process the
  extracted block. !*/

public class TheReplacements {
public static void main(String[] args) throws Exception {
  String s = "Here’s a block of text to use as input to"
  + "the regular expression matcher. Note that we’ll"
  + "first extract the block of text by looking for"
  + "the special delimiters, then process the"
  + "extracted block. !";
  // Match the specially commented block of text above:
  Matcher mInput =
    Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL)
      .matcher(s);
  if(mInput.find())
    s = mInput.group(1); // Captured by parentheses
  // Replace two or more spaces with a single space:
  s = s.replaceAll(" {2,}", " ");
  // Replace one or more spaces at the beginning of each
  // line with no spaces. Must enable MULTILINE mode:
  s = s.replaceAll("(?m)^ +", "");
  System.out.println(s);
  s = s.replaceFirst("[aeiou]", "(VOWEL1)");
  StringBuffer sbuf = new StringBuffer();
  Pattern p = Pattern.compile("[aeiou]");
  Matcher m = p.matcher(s);
  // Process the find information as you
//perform the replacements:
  while(m.find())
    m.appendReplacement(sbuf, m.group().toUpperCase());
  // Put in the remainder of the text:
  m.appendTail(sbuf);
  System.out.println(sbuf);
}
} /* Output:
Here’s a block of text to use as input to
the regular expression matcher. Note that we’ll
first extract the block of text by looking for
the special delimiters, then process the
extracted block.
H(VOWEL1)rE’s A blOck Of tExt tO UsE As InpUt tO
thE rEgUlAr ExprEssIOn mAtchEr. NOtE thAt wE’ll
fIrst ExtrAct thE blOck Of tExt by lOOkIng fOr
thE spEcIAl dElImItErs, thEn prOcEss thE
ExtrActEd blOck.
*///:~