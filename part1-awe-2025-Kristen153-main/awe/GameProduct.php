<?php

namespace awe;

class GameProduct extends ShopProduct
{
    private $pegiRating;

    public function __construct(
        string $id,
        string $title,
        string $firstName,
        string $mainName,
        float $price,
        int $pegiRating
    )
    {
        parent::__construct(
            $id,
            $title,
            $firstName,
            $mainName,
            $price
        );
        $this->pegiRating = $pegiRating;
    }

    public function getPegiRating()
    {
        return $this->pegiRating;
    }
}
