# Kotlin removeIf Bug
This example highlights a potential issue when using the `removeIf` function on mutable collections in Kotlin. The problem arises from modifying the collection while iterating over it using an iterator.  This can lead to unexpected results and should be avoided.

**Bug:** The code attempts to remove even numbers from both a list and a map using `removeIf`. While it works correctly for the list, the map's behavior might be unpredictable or throw exceptions depending on the specific implementation.

**Solution:**  The solution demonstrates safer approaches to modify collections, avoiding direct modification during iteration.