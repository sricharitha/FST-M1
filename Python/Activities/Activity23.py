import pytest

def test_sum(list):
    sum = 0
    for n in list:
        sum += n
    assert sum == 55
