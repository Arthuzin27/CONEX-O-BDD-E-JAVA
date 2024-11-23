use onibus_passagem;
DELIMITER $$
CREATE PROCEDURE onibusMarca()
BEGIN 

DECLARE onibusMarca varchar (100);
SET onibusMarca = 'Marcopolo';
SELECT onibusMarca;

END$$
DELIMITER ;

CALL onibusMarca();
