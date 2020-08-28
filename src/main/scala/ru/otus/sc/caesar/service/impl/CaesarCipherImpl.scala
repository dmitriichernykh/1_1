package ru.otus.sc.caesar.service.impl

import ru.otus.sc.caesar.model.{CipherRequest, CipherResponse, DecipherRequest, DecipherResponse}
import ru.otus.sc.caesar.service.CaesarCipher

class CaesarCipherImpl extends CaesarCipher {
  private val cardinality = 128

  /** Enciphers a text using Caesar cipher
    * @param request  a text to be enciphered
    * @return         cipher text
    */
  def cipher(request: CipherRequest): CipherResponse =
    CipherResponse(
      request.text.map(c => ((c + request.shift) % cardinality).toChar)
    )

  /** Deciphers a cipher text using Caesar cipher
    *
    * @param request   a cipher text to be deciphered
    * @return          a deciphered text
    */
  def decipher(request: DecipherRequest): DecipherResponse =
    DecipherResponse(
      request.text.map(c => ((c - request.shift) % cardinality).toChar)
    )
}
