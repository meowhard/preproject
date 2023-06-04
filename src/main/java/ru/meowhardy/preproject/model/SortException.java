package ru.meowhardy.preproject.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Выбранный способ сортировки недоступен")
public class SortException extends RuntimeException{
}
