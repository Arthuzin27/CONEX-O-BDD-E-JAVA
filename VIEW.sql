CREATE VIEW DestinoColatina AS
SELECT  oni.placa, oni.quantidade_assento, vi.cidade_origem, vi.cidade_destino, vi.data_saida
FROM viagem vi
inner join onibus oni on oni.id = vi.id_onibus
WHERE cidade_destino = 'Colatina-ES'

