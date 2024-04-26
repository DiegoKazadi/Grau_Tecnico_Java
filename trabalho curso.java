@@ -1,16 +1,19 @@
#check_guest.py

# Script para verificar se um nome está na lista de convidados e se o convidado é maior de idade .
 Script para verificar se um nome está na lista de convidados.

def  check_guest ( nome , lista_convidados ):
    if name in list_convidados:
    # Verifique se o nome da pessoa está na lista de convidados e se o convidado é maior de idade .
    se  o nome estiver  na  guest_list :
        print ( "Acesso permitido." )
        if  lista_convidados [ nome ] >=  18 :
            print ( "Acesso permitido." )
        outro :
            print ( "Você foi convidado, mas é menor de idade." )
    outro :
        print ( "Acesso negado." )
        print ( "Acesso negado. Nome não encontrado na lista. " )

def  principal ():
    
    
    # Lista de pedidos autorizados com suas respectivas idades
    lista_convidados  =  { "Aline" : 24 , "Pedro" : 16 , "Carlos" : 23 , "Diego" : 13, "Maria" 32 }

    # Solicita ao usuário que digite um nome
    name  =  input ( "Digite o nome do convidado: " )
    
    def check_guest(name, guest_list):
    # Verifica se o nome fornecido está na lista de convidados.
    if not name in guest_list:
        print("Acesso negado por não estar na lista de convidados.")
    else:
        # Solicita ao usuário que digite a idade
        age = int(input("Digite a idade do convidado: "))

        # Verifica se idade é maior ou igual a 18.
        if age >= 18:
            print(if"O convidado {name} tem acesso permitido e é maior de idade.")
        else:
            print(if"O convidado {name} não tem acesso por ser menor de idade.")
            name = input("Digite o nome do convidado: ")
            check_guest(name, guest_list)