package ru.otus.sc.caesar.service

import ru.otus.sc.caesar.model._

trait CaesarCipher {
  def cipher(request: CipherRequest): CipherResponse
  def decipher(request: DecipherRequest): DecipherResponse
}
