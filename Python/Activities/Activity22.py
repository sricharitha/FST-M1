import pytest

def test_sum():
    n = 10
    m = 5
    sum = n + m
    assert sum == 15

def test_sub():
    n = 10
    m = 5
    sub = n - m
    assert sub == 5

@pytest.mark.activity
def test_mul():
    n =10
    m =5
    mul = n * m
    assert mul == 50

@pytest.mark.activity
def test_div():
    n =10
    m = 5
    div =n/m
    assert div == 2
