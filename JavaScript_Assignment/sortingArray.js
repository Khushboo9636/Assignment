function sortArrayDescending(arr) {
    arr.sort((a, b) => b - a);
    return arr;
  }

  const inputArray = [5, 2, 8, 1, 9, 3];
  const sortedArray = sortArrayDescending(inputArray);
  console.log(sortedArray); 
  