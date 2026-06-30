const leaders_in_array = (arr) => {
    if (arr.length < 0) {
        return [];
    }
    const output = [arr.at(-1)];
    let current_max = arr.at(-1);
    for (let i = arr.length - 2; i >= 0; i--) {
        if (arr[i] >= current_max) {
            output.push(arr[i]);
            current_max = arr[i];
        }
    }
    return output.reverse();
}

// Time Complexity: n + n = O(n)
// Space Complexity: O(n)

console.log(leaders_in_array([5, 10, 20, 40]));
console.log(leaders_in_array([10, 4, 2, 4, 1]));