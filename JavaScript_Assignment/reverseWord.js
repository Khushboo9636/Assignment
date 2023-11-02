function reverseWordsInSentence(sentence) {
    
    const words = sentence.split(' ');
    const reversedSentence = words
      .map(word => word.split('').reverse().join(''))
      .join(' ');
  
    return reversedSentence;
  }
  
  const inputSentence = "This is a sunny day";
  const reversedSentence = reverseWordsInSentence(inputSentence);
  console.log(reversedSentence);
  