/* Write your T-SQL query statement belo */
 SELECT score, DENSE_RANK() OVER (ORDER BY score desc) rank from scores;