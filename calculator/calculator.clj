(def input "1,2,3\n4,3001")

(def empty-input '" ")

;;(re-find #"(\d+)*" input)

(defn get-numbers [list]
  (map read-string
       (clojure.string/split list #"\D+")))

(defn filter-1000 [list]
  (filter #(> 1000 %) list))

;;(filter #(> 2 %) '(1 2 3 4))

(defn add [input]
  (reduce + ((comp filter-1000 get-numbers) input)))

(add input)

(add empty-input)

