package br.com.alura.forum.anotation


import io.jsonwebtoken.Jwts

// @Component
class Ajwt ()
{
    fun generateToken (username: String): String?{
        return Jwts.builder()
            .subject(username)
            .
    }

}