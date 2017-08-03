def mushrooms(A, k, m):
2 n = len(A)
3 result = 0
4 pref = prefix_sums(A)
5 for p in xrange(min(m, k) + 1):
6 left_pos = k - p
7 right_pos = min(n - 1, max(k, k + m - 2 * p))
8 result = max(result, count_total(pref, left_pos, right_pos))
9 for p in xrange(min(m + 1, n - k)):
10 right_pos = k + p
11 left_pos = max(0, min(k, k - (m - 2 * p)))
12 result = max(result, count_total(pref, left_pos, right_pos))
13 return result


(defn prefix-sum [A]
  (loop [i 1
         C (vector (first A))]
       (if (< i (count A))
        (recur (inc i) (conj C (+ (nth A i) (last C))))
        C)))

(prefix-sum [2 3 7 5 1 3 9])


(defn passing-cars [A k m]
  (let [A' (vec (range 1 (inc x)))]
    (loop [i 0
           B []]
          (if (= A' (vec (sort B)))
            i
            (recur (inc i) ( distinct (conj B (nth A i))))))))
