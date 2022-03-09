# chat-nodejs


O chat foi implementado utilizando a biblioteca [Socket.io]

O template utilizado no frontend possui alguns campos:

nome - mensagem - event e o botão send

O backend faz tratamento de alguns eventos de io através do socket

create-room -> utilizada na criação da sala
join-room -> utilizado para ficar estudando na stream da sala

O frontend faz tratamento de outros eventos gerados pelo backend

new-message -> quando a mensagem é passada para o canal do backend ele emite esse evento que trafega a mensagem para a sala

o frontend pode ser utilizado para teste de outros eventos que poderão futuramente ser implementados.

