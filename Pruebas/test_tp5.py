from TP5 import suma, dni_valido
import pytest
@pytest.mark.parametrize("input_x, input_y, expected",[(4, 6, 10),(9, 2, 11),(30, 10, 40)])

def test_imputsuma(input_x, input_y, expected):
    assert suma(input_x, input_y) == expected


@pytest.mark.parametrize("input_x, expected", [("12345678", True),("1234567", True),("123456", False)])

def test_imput_dni_valido(input_x, expected):
    assert dni_valido(input_x) == expected