# Basic Hashing in Java

## 1. What is Hashing?

Hashing is a technique used to store and retrieve information efficiently.

In DSA, we commonly use hashing to:

- Count how many times an element appears.
- Check whether an element exists.
- Find the frequency of a particular element.
- Answer multiple frequency queries efficiently.

### Why do we need hashing?

Suppose we have an array:

```java
int[] arr = {1, 2, 3, 1, 2, 1, 5};
```

Now imagine someone asks us:

- How many times does `1` appear?
- How many times does `2` appear?
- How many times does `5` appear?

One simple approach is to traverse the entire array every time we receive a query.

However, if we have many queries, repeatedly traversing the array becomes inefficient.

**Hashing solves this problem by storing the frequency of each element beforehand.**

Instead of searching the entire array every time, we can directly access the stored frequency.

---

## 2. Frequency Array (Basic Hashing)

Let's understand the basic idea of hashing using an array.

Consider:

```java
int[] arr = {1, 2, 3, 1, 2, 1, 5};
```

### Step 1: Create a hash array

```java
int[] hash = new int[6];
```

Initially, the hash array contains:

```text
Index:  0  1  2  3  4  5
Value:  0  0  0  0  0  0
```

**How does this work?**

- Each index represents a number.
- The value at that index represents how many times that number appears.

For example:

- `hash[1]` stores the frequency of `1`.
- `hash[2]` stores the frequency of `2`.
- `hash[3]` stores the frequency of `3`.

### Step 2: Precompute frequencies

Traverse the original array and increase the corresponding index.

```java
for (int i = 0; i < arr.length; i++) {
    hash[arr[i]]++;
}
```

Let's understand what happens during each iteration:

| Current element | Operation | Updated value |
|---|---|---|
| 1 | hash[1]++ | 1 |
| 2 | hash[2]++ | 1 |
| 3 | hash[3]++ | 1 |
| 1 | hash[1]++ | 2 |
| 2 | hash[2]++ | 2 |
| 1 | hash[1]++ | 3 |
| 5 | hash[5]++ | 1 |

After processing the entire array:

```text
Index:  0  1  2  3  4  5
Value:  0  3  2  1  0  1
```

This is our frequency table.

### Step 3: Answer queries

Suppose we want to know how many times `1` appears.

```java
System.out.println(hash[1]); // 3
```

Similarly:

```java
System.out.println(hash[2]); // 2
System.out.println(hash[3]); // 1
System.out.println(hash[5]); // 1
```

Notice something important:

**We don't need to traverse the original array again.**

We can directly access the frequency using the corresponding index.

This is the basic idea of hashing.

### Complete Java Example

```java
public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 2, 1, 5};

        // Step 1: Create frequency array
        int[] hash = new int[6];

        // Step 2: Precompute frequencies
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        // Step 3: Answer queries
        System.out.println(hash[1]); // 3
        System.out.println(hash[2]); // 2
        System.out.println(hash[3]); // 1
        System.out.println(hash[5]); // 1
    }
}
```

---

## 3. What Are Precomputation and Queries?

These two terms are frequently used in hashing problems.

### Precomputation

Precomputation means processing the original data beforehand and storing useful information so that future operations become faster.

In our example:

```java
for (int i = 0; i < arr.length; i++) {
    hash[arr[i]]++;
}
```

We are calculating and storing the frequency of every element.

This process is called precomputation.

### Queries

A query is simply a question asked about the stored information.

For example:

```java
int q = 3;

System.out.println(hash[q]);
```

Here, we are asking:

"How many times does 3 appear in the original array?"

The answer is available directly from the hash array.

**Remember:**

- Precomputation = Build the frequency table.
- Query = Retrieve information from the frequency table.

---

## 4. Limitation of Frequency Arrays

Frequency arrays are useful, but they have some limitations.

### Problem 1: What if the numbers are very large?

Consider:

```java
int[] arr = {100000, 200000, 100000};
```

To use direct indexing, we would need:

```java
int[] hash = new int[200001];
```

Why?

Because we need an index for the number `200000`.

But we are storing frequencies for only three elements.

Most of the allocated positions will remain unused, resulting in wasted memory.

### Problem 2: What if the numbers are negative?

Consider:

```java
int[] arr = {-1, -2, 3, -1};
```

We cannot directly do:

```java
hash[-1]++;
```

Because array indices cannot be negative.

### Solution: Use HashMap

Java provides a data structure called `HashMap` that allows us to store information using key-value pairs.

It solves these problems without requiring us to allocate an array based on the largest number.

---

## 5. HashMap in Java

A HashMap stores data in the form of key-value pairs.

For frequency counting:

- Key = Element
- Value = Frequency of that element

Consider:

```java
int[] arr = {1, 2, 3, 1, 2, 1, 5};
```

Our HashMap will conceptually contain:

| Key (Element) | Value (Frequency) |
|---|---|
| 1 | 3 |
| 2 | 2 |
| 3 | 1 |
| 5 | 1 |

Notice that we store only the elements that actually appear in the array.

We don't need to create empty positions for every possible number.

### Step 1: Create a HashMap

```java
HashMap<Integer, Integer> map = new HashMap<>();
```

Here:

- First `Integer` represents the key.
- Second `Integer` represents the value.

We use `Integer` instead of `int` because Java collections store objects, not primitive types.

### Step 2: Precompute frequencies

```java
for (int i = 0; i < arr.length; i++) {

    int num = arr[i];

    map.put(num, map.getOrDefault(num, 0) + 1);
}
```

Let's understand this important line:

```java
map.put(num, map.getOrDefault(num, 0) + 1);
```

### Understanding getOrDefault()

The method:

```java
map.getOrDefault(key, defaultValue)
```

works as follows:

- If the key exists, return its existing value.
- If the key doesn't exist, return the default value.

For example:

```java
map.getOrDefault(1, 0);
```

If key `1` exists, it returns its stored value.

If key `1` doesn't exist, it returns `0`.

### Understanding the frequency update

Suppose:

```java
int num = 1;
```

**First occurrence of 1**

Initially, the map is empty.

```java
map.put(1, map.getOrDefault(1, 0) + 1);
```

Since key `1` doesn't exist:

```text
0 + 1 = 1
```

Map becomes:

```text
1 -> 1
```

**Second occurrence of 1**

Now key `1` already exists with value `1`.

```text
1 + 1 = 2
```

Map becomes:

```text
1 -> 2
```

**Third occurrence of 1**

The existing value is now `2`.

```text
2 + 1 = 3
```

Map becomes:

```text
1 -> 3
```

That's how we count frequencies using a HashMap.

### Complete Java Example

```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 2, 1, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Precompute frequencies
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Answer queries
        System.out.println(map.getOrDefault(1, 0)); // 3
        System.out.println(map.getOrDefault(2, 0)); // 2
        System.out.println(map.getOrDefault(5, 0)); // 1
        System.out.println(map.getOrDefault(10, 0)); // 0
    }
}
```

**Important:** Notice that querying `10` returns `0` because it doesn't exist in the map.

This is useful because we don't have to check whether the key exists separately.

### Important HashMap Methods

| Method | Purpose |
|---|---|
| `put(key, value)` | Insert a new key or update an existing key |
| `get(key)` | Retrieve the value associated with a key |
| `getOrDefault(key, 0)` | Retrieve the value or return 0 if absent |
| `containsKey(key)` | Check whether a key exists |
| `remove(key)` | Remove a key-value pair |
| `size()` | Return the number of key-value pairs |
| `isEmpty()` | Check whether the map is empty |

**Important:** `get(key)` returns `null` if the key doesn't exist, whereas `getOrDefault(key, 0)` returns `0` in that situation.

---

## 6. Handling Negative and Large Numbers Using HashMap

Let's verify why HashMap is useful.

Consider:

```java
int[] arr = {-1, -2, 3, -1, 100000, 100000};
```

Using a frequency array would require extra handling for negative numbers and a potentially large range.

With HashMap:

```java
HashMap<Integer, Integer> map = new HashMap<>();

for (int num : arr) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}
```

The resulting map conceptually contains:

| Key | Frequency |
|---|---|
| -1 | 2 |
| -2 | 1 |
| 3 | 1 |
| 100000 | 2 |

We can directly query:

```java
System.out.println(map.getOrDefault(-1, 0));     // 2
System.out.println(map.getOrDefault(100000, 0)); // 2
```

No negative-index problem and no need to allocate a huge frequency array.

---

## 7. Character Hashing

Hashing isn't limited to integers.

We can also calculate the frequency of characters in a string.

Consider:

```java
String s = "abacaba";
```

We want to calculate how many times each character appears.

### Approach 1: Using a Frequency Array

If the string contains only lowercase English letters (`a` to `z`), we can use an array of size 26.

```java
int[] hash = new int[26];

for (int i = 0; i < s.length(); i++) {
    hash[s.charAt(i) - 'a']++;
}
```

### Why do we use charAt(i) - 'a'?

Because Java stores characters using numeric character codes.

Subtracting `'a'` converts lowercase English letters into indices ranging from 0 to 25.

| Character | Index calculation | Index |
|---|---|---|
| a | 'a' - 'a' | 0 |
| b | 'b' - 'a' | 1 |
| c | 'c' - 'a' | 2 |
| d | 'd' - 'a' | 3 |
| ... | ... | ... |
| z | 'z' - 'a' | 25 |

For example:

```java
'a' - 'a' = 0
'b' - 'a' = 1
'c' - 'a' = 2
```

Therefore:

- `hash[0]` stores the frequency of `a`.
- `hash[1]` stores the frequency of `b`.
- `hash[2]` stores the frequency of `c`.

### Result for "abacaba"

```text
Character: a  b  c
Frequency: 4  2  1
```

We can retrieve the frequencies:

```java
System.out.println(hash[0]); // 4 (a)
System.out.println(hash[1]); // 2 (b)
System.out.println(hash[2]); // 1 (c)
```

### Complete Java Example

```java
public class Main {
    public static void main(String[] args) {

        String s = "abacaba";

        int[] hash = new int[26];

        // Precompute character frequencies
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            hash[ch - 'a']++;
        }

        // Print frequencies of a, b and c
        System.out.println("a: " + hash['a' - 'a']); // 4
        System.out.println("b: " + hash['b' - 'a']); // 2
        System.out.println("c: " + hash['c' - 'a']); // 1
    }
}
```

**Important limitation:**

The `int[26]` approach works only for lowercase English letters.

For uppercase, mixed-case, or arbitrary characters, use an appropriate mapping or `HashMap<Character, Integer>`.

### Approach 2: Using HashMap for Characters

```java
String s = "abacaba";

HashMap<Character, Integer> map = new HashMap<>();

for (int i = 0; i < s.length(); i++) {

    char ch = s.charAt(i);

    map.put(ch, map.getOrDefault(ch, 0) + 1);
}
```

Here:

- Key = Character
- Value = Frequency

We use `Character` because the key represents a character rather than an integer.

---

## 8. Array vs HashMap vs HashSet

Now let's understand when to use each data structure.

| Situation | Recommended data structure |
|---|---|
| Numbers have a small, known range | Frequency array |
| Lowercase English characters | `int[26]` |
| Numbers can be negative | HashMap |
| Numbers can be very large | HashMap |
| Character set is unknown or flexible | HashMap |
| Need to store unique elements only | HashSet |
| Need frequency of each element | HashMap or frequency array |

### What is HashSet?

A HashSet stores unique elements only.

For example:

```java
HashSet<Integer> set = new HashSet<>();

set.add(1);
set.add(2);
set.add(1);
set.add(3);
```

The set contains:

```text
[1, 2, 3]
```

Notice that duplicate values are not stored.

**Remember:**

- Array hashing: Store frequencies using indices.
- HashMap: Store key-value pairs.
- HashSet: Store unique elements.

---

## 9. Time and Space Complexity

Understanding complexity is important because hashing is mainly used to improve efficiency.

Suppose:

- `N` = Number of elements in the original array.
- `Q` = Number of queries.

### Approach 1: Brute Force

For every query, traverse the entire array and count occurrences.

```java
for each query:
    count = 0;

    for each element in arr:
        if element == query:
            count++;
```

Time complexity:

```text
O(N * Q)
```

Why?

- Each query requires traversing `N` elements.
- We have `Q` queries.

Therefore, total complexity is `O(N × Q)`.

### Approach 2: Using Hashing

First, build the frequency table.

```java
for (int num : arr) {
    hash[num]++;
}
```

This takes `O(N)` time.

After that, each query can be answered in `O(1)` time using direct array indexing.

For `Q` queries:

```text
Precomputation = O(N)
Queries         = O(Q)

Total           = O(N + Q)
```

### Complexity Comparison

| Approach | Precomputation | Query | Total |
|---|---|---|---|
| Brute force | None | O(N) | O(N × Q) |
| Frequency array | O(N) | O(1) | O(N + Q) |
| HashMap | O(N) average | O(1) average | O(N + Q) average |

### Space Complexity

- Frequency array: `O(R)`, where `R` is the size of the frequency array.
- HashMap: `O(K)`, where `K` is the number of distinct keys.

**Important:** HashMap operations are generally O(1) on average, not guaranteed O(1) in every situation. Hash collisions can affect performance.

---

## 10. Important Concepts to Remember

Before solving hashing problems, make sure you understand these points:

1. Hashing helps us retrieve information efficiently.
2. Frequency counting is one of the most common applications of hashing.
3. Precomputation means calculating and storing information beforehand.
4. Queries retrieve information from the precomputed data.
5. A frequency array uses indices to represent elements.
6. A HashMap stores information in key-value pairs.
7. `getOrDefault()` is particularly useful for frequency counting.
8. A HashSet stores unique elements and does not maintain frequencies.
9. For lowercase English characters, `int[26]` is sufficient.
10. HashMap operations generally take O(1) average time.

---

## 11. Common Mistakes and Doubts

### Q1. Why do we write `hash[arr[i]]++`?

Because `arr[i]` represents the current element, and that element is used as an index to access its frequency.

For example, if:

```java
arr[i] = 2;
```

Then:

```java
hash[arr[i]]++;
```

is equivalent to:

```java
hash[2]++;
```

It increases the frequency of element `2` by one.

### Q2. Why do we use `getOrDefault(num, 0)`?

Because a number may appear for the first time.

If the key doesn't exist, its initial frequency should be zero.

We then increase it by one.

### Q3. Does HashMap store duplicate keys?

No.

Every key is unique. If we insert an existing key again, its value gets updated.

For example:

```java
map.put(1, 2);
map.put(1, 3);
```

The map contains:

```text
1 -> 3
```

### Q4. Does HashMap maintain insertion order?

No. A regular HashMap does not guarantee insertion order.

If insertion order matters, Java provides `LinkedHashMap`.

### Q5. Can HashMap store negative keys?

Yes.

```java
map.put(-1, 5);
```

This is completely valid.

### Q6. What happens if we query an element that doesn't exist?

Using:

```java
map.getOrDefault(10, 0);
```

We get `0`.

Using:

```java
map.get(10);
```

We get `null` if the key doesn't exist.

---

## 12. Practice Problems

Try solving these problems in order. They will help you understand basic hashing before moving to advanced topics.

### Beginner Level

- [ ] Count the frequency of every element in an array.
- [ ] Find the frequency of a given number.
- [ ] Find the frequency of each character in a string.
- [ ] Count the number of distinct elements in an array.
- [ ] Check whether an array contains a particular element.

### Easy DSA Problems

- [ ] Find the highest-frequency element.
- [ ] Find the lowest-frequency element.
- [ ] Find the first non-repeating character.
- [ ] Find the first repeating element.
- [ ] Find the most frequent character in a string.

---

## 13. Final Takeaway

The most important idea behind basic hashing is simple:

**Instead of repeatedly searching through the original data, preprocess it once and store the information we need.**

For frequency counting:

- Use a frequency array when the range of elements is small and known.
- Use HashMap when elements can be large, negative, or unrestricted.
- Use HashSet when you only need unique elements.

Once you understand frequency arrays, precomputation, HashMap, and character hashing, you have a solid foundation for solving basic hashing problems in DSA.

**Next topic to learn:** Counting frequencies using HashMap, followed by finding the highest and lowest frequency elements.