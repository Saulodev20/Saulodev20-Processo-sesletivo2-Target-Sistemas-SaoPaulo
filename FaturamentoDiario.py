import json

#Dados de faturamento em formato JSON
dados = '''
{
    "faturamento": [1000, 0, 1200, 900, 0, 0, 1300, 0, 1000, 1100, 0, 1050, 900, 0, 0, 1000, 1100, 950, 0, 0, 0, 1000, 0, 1050, 0, 1150, 0, 1200, 0, 1250]
}
'''

# Carregando os dados
faturamento = json.loads(dados)["faturamento"]

# Removendo dias sem faturamento
faturamento = [valor for valor in faturamento if valor != 0]

# Calculando valores
menor_valor = min(faturamento)
maior_valor = max(faturamento)
media_mensal = sum(faturamento) / len(faturamento)
dias_acima_da_media = len([valor for valor in faturamento if valor > media_mensal])

print(f"Menor valor de faturamento: R$ {menor_valor}")
print(f"Maior valor de faturamento: R$ {maior_valor}")
print(f"Dias com faturamento acima da média: {dias_acima_da_media}")
