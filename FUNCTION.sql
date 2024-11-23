use onibus_passagem;
DELIMITER $$

CREATE FUNCTION soma_passagens(preco1 DECIMAL(10,2), preco2 DECIMAL(10,2))
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE total DECIMAL(10,2);
    SET total = preco1 + preco2;
    RETURN total;
END$$

DELIMITER ;

SELECT soma_passagens(25, 25) AS total;